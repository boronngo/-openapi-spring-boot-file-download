package org.openapitools.api

import org.openapitools.model.ImageType
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class DownloadApiTest {

    private val service: DownloadApiService = DownloadApiServiceImpl()
    private val api: DownloadApiController = DownloadApiController(service)

    
    /**
    * CSVダウンロード
    *
    * 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun csvGetTest() {
        val response: ResponseEntity<kotlin.String> = api.csvGet()

        // TODO: test validations
    }
    
    /**
    * CSVダウンロード(sjis)
    *
    * 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun csvSjisGetTest() {
        val response: ResponseEntity<kotlin.String> = api.csvSjisGet()

        // TODO: test validations
    }
    
    /**
    * 画像ダウンロード
    *
    * 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun imageGetTest() {
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.imageGet()

        // TODO: test validations
    }
    
    /**
    * 画像ダウンロード(jpeg or png)
    *
    * 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun imageJpegOrPngGetTest() {
        val type:ImageType? = null
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.imageJpegOrPngGet(type!!)

        // TODO: test validations
    }
    
}
