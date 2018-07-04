package com.example.sample.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.example.sample.dao.AuthorDao
import org.springframework.stereotype.Component

@Component
class AuthorQueryResolver(private val authorDao : AuthorDao) : GraphQLQueryResolver {
    fun getAuthorById(id: Int) = authorDao.getAuthorById(id)
}
