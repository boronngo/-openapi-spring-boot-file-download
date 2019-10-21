package org.openapitools.api

interface DownloadApiService {

	fun csvGet(): kotlin.String

	fun csvSjisGet(): kotlin.String

	fun imageGet(): org.springframework.core.io.Resource
}
