package com.example.sample.resolvers

import com.coxautodev.graphql.tools.GraphQLResolver
import com.example.sample.dao.BookDao
import com.example.sample.types.Author
import org.springframework.stereotype.Component

@Component
class BookResolver(private val bookDao : BookDao) : GraphQLResolver<Author> {
    fun books(author: Author) = bookDao.getBooksByAuthorId(author.id)
}
