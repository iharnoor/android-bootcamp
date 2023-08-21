package com.example.moviedatabase

object Constants {
    const val BASE_URL = "https://api.themoviedb.org/3/"
    const val MOVIE_PATH = "https://image.tmdb.org/t/p/original/"


    //folder
    const val MOVIES_LIST_END_URL="movie/popular"
    const val SEARCH_MOVIES_END_URL="search/movie"

    const val API_KEY = "3e4e6775a71a4e213c6430b6f4cdb740"


    //image = movie_path + poster from Movie Object
    // https://image.tmdb.org/t/p/original/jZIYaISP3GBSrVOPfrp98AMa8Ng.jpg

    //    Base + popular movie folder + api key (query)
//    https://api.themoviedb.org/3/movie/popular?api_key=3e4e6775a71a4e213c6430b6f4cdb740
}