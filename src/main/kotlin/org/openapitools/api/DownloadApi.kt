package org.openapitools.api

import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/api}")
class DownloadApiController(@Autowired(required = true) val service: DownloadApiService) {


    @RequestMapping(
        value = ["/csv"],
        produces = ["text/csv"], 
        method = [RequestMethod.GET])
    fun csvGet(): ResponseEntity<kotlin.String> {
        return ResponseEntity(service.csvGet(), HttpStatus.valueOf(200))
    }


    @RequestMapping(
        value = ["/csv/sjis"],
        produces = ["text/csv; charset=Shift_JIS"], 
        method = [RequestMethod.GET])
    fun csvSjisGet(): ResponseEntity<kotlin.String> {
        return ResponseEntity(service.csvSjisGet(), HttpStatus.valueOf(200))
    }
}
