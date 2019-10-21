package org.openapitools.api

import org.openapitools.model.ImageType
interface DownloadApiService {

	fun csvGet(): kotlin.String

	fun csvSjisGet(): kotlin.String

	fun imageGet(): org.springframework.core.io.Resource

	fun imageJpegOrPngGet(type: ImageType): org.springframework.core.io.Resource
}
