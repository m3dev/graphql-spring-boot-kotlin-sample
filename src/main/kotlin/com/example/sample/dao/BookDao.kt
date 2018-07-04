package com.example.sample.dao

import com.example.sample.types.Book
import org.springframework.stereotype.Component

@Component
class BookDao {
    private val data = mutableListOf(
        Book(id = 1, name = "Elixir入門", authorId = 1),
        Book(id = 2, name = "Erlang入門", authorId = 2),
        Book(id = 3, name = "Kotlin入門", authorId = 2),
        Book(id = 4, name = "Rust入門", authorId = 2)
    )

    fun getBooksByAuthorId(authorId: Int) = data.filter { book -> book.authorId == authorId }
}
