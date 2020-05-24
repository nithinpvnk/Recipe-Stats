package com.techdining.www.recipestats.dataModels

data class Digest(
    val daily: Double?, // 320.0775423077816
    val hasRDI: Boolean?, // true
    val label: String?, // Fat
    val schemaOrgTag: String?, // fatContent
    val sub: List<Sub>?,
    val tag: String?, // FAT
    val total: Double?, // 208.05040250005803
    val unit: String? // g
)