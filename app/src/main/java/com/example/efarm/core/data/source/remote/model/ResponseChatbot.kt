package com.example.efarm.core.data.source.remote.model


data class Candidate(
    val content: Content,
)

data class ResponseChatbot(
    val candidates: List<Candidate>
)

data class Content(
    val parts: List<Part>
)

data class Part(
    val text: String
)

data class ContentsRequest(
    val contents: List<Content>
)

data class ChatBot(
    val confidence: Float?=null,
    val question:String?=null,
    val preprocessed_text:String?=null,
    val id: String?=null,
    val title: String?=null,
    val thread: String?=null,
    val img: String?=null
//    val summary: String
)

data class ChatRequest(
    val text:String
)

