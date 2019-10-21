package org.openapitools.api

import org.openapitools.model.ImageType
import org.springframework.core.io.ClassPathResource
import org.springframework.core.io.Resource
import org.springframework.stereotype.Service

@Service
class DownloadApiServiceImpl : DownloadApiService {
    override fun csvGet(): String {
        return "商品名,価格\nりんご,100\nオレンジ,200"
    }

    override fun csvSjisGet(): String {
        return "商品名,価格\nりんご,100\nオレンジ,200"
    }

    override fun imageGet(): Resource {
        return ClassPathResource("image.jpg")
    }

    override fun imageJpegOrPngGet(type: ImageType): Resource {
        return when (type) {
            ImageType.jpeg -> ClassPathResource("image.jpg")
            ImageType.png -> ClassPathResource("image.png")
        }
    }
}