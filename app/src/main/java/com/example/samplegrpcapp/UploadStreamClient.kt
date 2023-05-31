import android.content.Context
import android.util.Log
import com.example.samplegrpcapp.ProtoRequest
import com.example.samplegrpcapp.ProtoResponse
import com.example.samplegrpcapp.R
import com.example.samplegrpcapp.UploadServiceGrpc
import com.google.protobuf.ByteString
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.grpc.stub.StreamObserver
import java.io.IOException

private const val TAG = "UploadStreamClient"
class UploadStreamClient(val context: Context, host: String?, port: Int) {
    private val channel: ManagedChannel
    private val asyncStub: UploadServiceGrpc.UploadServiceStub
    private val responseObserver: ResponseStreamObserver

    init {
        channel = ManagedChannelBuilder.forAddress(host, port)
            .usePlaintext()
            .build()
        asyncStub = UploadServiceGrpc.newStub(channel)

        responseObserver = ResponseStreamObserver()
    }

    fun uploadFile(filePath: String?) {
        try {
            context.resources.openRawResource(R.raw.sabeghe).use { fileInputStream ->


                // Read and send the file chunks
                val buffer = ByteArray(1024)
                var bytesRead: Int
                while (fileInputStream.read(buffer).also { bytesRead = it } != -1) {
                    asyncStub.uploadChunk(
                        ProtoRequest.Request.newBuilder().setStreamBytes(
                            ByteString.copyFromUtf8(ByteString.copyFrom(buffer).toStringUtf8())
                        ).setOid("Test OID").build(),
                        responseObserver
                    )
                }
            }
        } catch (e: IOException) {
            // Handle IO exception
            e.printStackTrace()
        }
    }

    inner class ResponseStreamObserver : StreamObserver<ProtoResponse.Response> {
        override fun onNext(value: ProtoResponse.Response?) {
            Log.e(TAG, "onNext: " + value?.id + " size: " + value?.size)
        }

        override fun onError(t: Throwable?) {
            Log.e(TAG, "onError: ${t?.message}")
            shutdown()
        }

        override fun onCompleted() {
            Log.e(TAG, "onCompleted: ")
        }

    }

    fun shutdown() {
        channel.shutdown()
    }
}