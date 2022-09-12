package com.example.kbsc

//import android.Manifest.permission_group.CAMERA
// android.hardware.SensorPrivacyManager.Sensors.CAMERA
//import android.media.MediaRecorder.VideoSource.CAMERA
import android.Manifest.permission.*
import android.app.appsearch.SetSchemaRequest.READ_EXTERNAL_STORAGE
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.MediaStore
import android.provider.MediaStore.Images.ImageColumns.DATE_TAKEN
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class InputImage : AppCompatActivity() {

    private val REQUEST_READ_EXTERNAL_STORAGE = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_image)

        //권한 부여되었는지 확인
        if (ContextCompat.checkSelfPermission(this,android.Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            //권한 허용되지 않음
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, android.Manifest.permission.READ_EXTERNAL_STORAGE)) {
                val builder=AlertDialog.Builder(this)
                builder.setTitle("권한이 필요한 이유")
                builder.setMessage("사진 정보를 얻으려면 외부 저장소 권한이 필수로 필요합니다.")
                builder.setPositiveButton("YES") { dialogInterface: DialogInterface?, i: Int ->
                    ActivityCompat.requestPermissions(
                        this@InputImage, arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),
                        REQUEST_READ_EXTERNAL_STORAGE
                    )
                }
                builder.setNegativeButton("NO") { dialogInterface: DialogInterface?, i: Int ->
                }
                builder.show()
                /*AlertDialog.Builder(this).run {
                        setTitle("권한이 필요한 이유")
                        setIcon(android.R.drawable.ic_dialog_alert)
                        setMessage("사진 정보를 얻으려면 외부 저장소 권한이 필수로 필요합니다")
                        setPositiveButton("YES", null)
                        setNegativeButton("NO", null)
                        show()*/
            }
             else {
                //권한 요청
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),REQUEST_READ_EXTERNAL_STORAGE)
            }
        } else {
            //권한이 이미 허용됨
            getAllPhotos()
        }
    }


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out
    String>,grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            REQUEST_READ_EXTERNAL_STORAGE -> {
                if ((grantResults.isNotEmpty()
                            && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                    //권한 허용됨
                    getAllPhotos()
                } else {
                    //권한 거부
                    Toast.makeText(this, "권한 거부됨", Toast.LENGTH_SHORT).show()
                }
                return
            }
        }
    }

    private fun getAllPhotos() {
        //모든 사진 정보 가져오기
        val cursor = contentResolver.query(
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
            null,
            null,
            null,
            DATE_TAKEN + "DESC")

        if (cursor != null) {
            while (cursor.moveToNext()) {
                //사진 경로 Uri 가져오기
                val uri = cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA))
                Log.d("InputImageActivity",uri)
            }
            cursor.close()
        }
    }

}
