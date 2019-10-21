package org.openapitools.api

import org.springframework.stereotype.Service

@Service
class DownloadApiServiceImpl : DownloadApiService {
    override fun csvGet(): String {
        return "商品名,価格\nりんご,100\nオレンジ,200"
    }

    override fun csvSjisGet(): String {
        return "商品名,価格\nりんご,100\nオレンジ,200"
    }
}