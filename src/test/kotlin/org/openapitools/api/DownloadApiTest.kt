package org.openapitools.api

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
        val response: ResponseEntity<Unit> = api.csvGet()

        // TODO: test validations
    }
    
}
