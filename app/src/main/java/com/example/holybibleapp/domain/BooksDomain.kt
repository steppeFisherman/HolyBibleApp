package com.example.holybibleapp.domain

import com.example.holybibleapp.core.Abstract
import com.example.holybibleapp.core.Book
import com.example.holybibleapp.presentation.BooksUi
import retrofit2.HttpException
import java.lang.Exception
import java.net.UnknownHostException

/**
 *
 * todo rename to BooksDomain
 */
sealed class BooksDomain : Abstract.Object<BooksUi, BooksDomainToUiMapper>() {

    class Success(private val books: List<Book>): BooksDomain() {
        override fun map(mapper: BooksDomainToUiMapper) = mapper.map(books)
    }

    class Fail(private val e: Exception) : BooksDomain(){
        override fun map(mapper: BooksDomainToUiMapper): BooksUi {
         val errorType = when(e){
             is UnknownHostException -> ErrorType.NO_CONNECTION
             is HttpException -> ErrorType.SERVICE_UNAVAILABLE
             else -> ErrorType.GENERIC_ERROR
         }
            return mapper.map(errorType)
        }
    }
}