package com.example.sample.dao

import com.example.sample.types.Author
import org.springframework.stereotype.Component

@Component
class AuthorDao {
    private val data = mutableListOf(
        Author(id = 1, name = "taka"),
        Author(id = 2, name = "susan")
    )

    fun getAuthorById(id: Int) = data.firstOrNull { author -> author.id == id }
}
