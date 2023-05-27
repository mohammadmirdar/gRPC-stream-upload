package com.example.samplegrpcapp

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.samplegrpcapp.ProtoReply.Reply
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.grpc.stub.AbstractAsyncStub
import io.grpc.stub.InternalClientCalls.StubType
import io.grpc.stub.StreamObserver

class MainActivity : AppCompatActivity() {

    private lateinit var layout_root: ConstraintLayout
    private lateinit var button_upload: Button
    private lateinit var image_view: ImageView
    private var selectedImageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout_root = findViewById(R.id.layout_root)
        image_view = findViewById(R.id.image_view)
        button_upload = findViewById(R.id.button_upload)

        image_view.setOnClickListener {
            openImageChooser()
        }

        button_upload.setOnClickListener {
            uploadImage()
        }




    }

    private fun uploadImage() {
        if (selectedImageUri == null) {
            Toast.makeText(this, "Select an Image First", Toast.LENGTH_SHORT).show()
            return
        }

        val managedChannel = ManagedChannelBuilder.forAddress("192.168.20.63", 30883)
            .usePlaintext()
            .build()

        val fileInfoBuilder = ProtoFileInfo.FileInfo.newBuilder()
        fileInfoBuilder.name = ""
        fileInfoBuilder.size = 0

        ProtoRequest.Request.newBuilder().info
        UploaderServiceGrpc.newStub(managedChannel).uploadStream(
            object : StreamObserver<Reply> {
                override fun onNext(value: Reply?) {

                }

                override fun onError(t: Throwable?) {

                }

                override fun onCompleted() {

                }

            }
        )
    }

    private fun openImageChooser() {
        Intent(Intent.ACTION_PICK).also {
            it.type = "image/*"
            val mimeTypes = arrayOf("image/jpeg", "image/png")
            it.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes)
            startActivityForResult(it, REQUEST_CODE_PICK_IMAGE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                REQUEST_CODE_PICK_IMAGE -> {
                    selectedImageUri = data?.data
                    image_view.setImageURI(selectedImageUri)
                }
            }
        }
    }

    companion object {
        const val REQUEST_CODE_PICK_IMAGE = 101
    }
}