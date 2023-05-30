package com.example.samplegrpcapp

import FileUtils
import UploadStreamClient
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
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


        val uploadStreamClient = UploadStreamClient(this,"192.168.20.63", 30883)


        uploadStreamClient.uploadFile(FileUtils.getFile(this, selectedImageUri)?.absolutePath)
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
        if (resultCode == RESULT_OK) {
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