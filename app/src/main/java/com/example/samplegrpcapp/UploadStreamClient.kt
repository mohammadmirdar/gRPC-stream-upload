import android.content.Context
import android.util.Log
import com.example.samplegrpcapp.R
import com.example.samplegrpcapp.RequestOuterClass
import com.example.samplegrpcapp.ResponseOuterClass
import com.example.samplegrpcapp.UploadServiceGrpc
import com.example.samplegrpcapp.UploadServiceGrpc.UploadServiceStub
import com.google.protobuf.ByteString
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.grpc.stub.ClientResponseObserver
import io.grpc.stub.StreamObserver
import java.io.File
import java.io.FileInputStream
import java.io.IOException

private const val TAG = "UploadStreamClient"
class UploadStreamClient(val context: Context, host: String?, port: Int) {
    private val channel: ManagedChannel
    private val asyncStub: UploadServiceStub
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
                        RequestOuterClass.Request.newBuilder().setStreamBytes(
                            ByteString.copyFromUtf8(ByteString.copyFrom(buffer, 0, bytesRead).toStringUtf8())
                        ).build(),
                        responseObserver
                    )
                    break
                }
            }
        } catch (e: IOException) {
            // Handle IO exception
            e.printStackTrace()
        }
    }

    inner class ResponseStreamObserver : StreamObserver<ResponseOuterClass.Response> {
        override fun onNext(value: ResponseOuterClass.Response?) {
            Log.e(TAG, "onNext: ")
        }

        override fun onError(t: Throwable?) {
            Log.e(TAG, "onError: ${t?.message}")
        }

        override fun onCompleted() {
            Log.e(TAG, "onCompleted: ")
        }

    }

    fun shutdown() {
        channel.shutdown()
    }
}