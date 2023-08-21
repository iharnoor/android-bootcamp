package com.example.moviedatabase

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviedatabase.api.domain.ApiMovie
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    // movies
    var movies: MutableLiveData<List<ApiMovie>> = MutableLiveData()

    fun getMovies() {
        //  call to API on a new thread
//        viewModelScope.launch(Dispatchers.IO) {
//            repository.getMovies()
//        }

    }

    fun getMockData(): List<ApiMovie> {
        val mockMovieList = listOf(
            ApiMovie(
                adult = false,
                backdrop_path = "/jZIYaISP3GBSrVOPfrp98AMa8Ng.jpg",
                genre_ids = listOf(1, 2, 3),
                id = 1,
                original_language = "en",
                original_title = "Example Movie 1",
                overview = "This is an example movie 1 overview.",
                popularity = 7.5,
                poster_path = "jZIYaISP3GBSrVOPfrp98AMa8Ng.jpg",
                release_date = "2023-08-19",
                title = "Example Movie 1",
                video = false,
                vote_average = 7.2,
                vote_count = 100
            ),
            ApiMovie(
                adult = false,
                backdrop_path = "/jZIYaISP3GBSrVOPfrp98AMa8Ng.jpg",
                genre_ids = listOf(4, 5, 6),
                id = 2,
                original_language = "en",
                original_title = "Example Movie 2",
                overview = "This is an example movie 2 overview.",
                popularity = 8.0,
                poster_path = "jZIYaISP3GBSrVOPfrp98AMa8Ng.jpg",
                release_date = "2023-08-20",
                title = "Example Movie 2",
                video = false,
                vote_average = 8.5,
                vote_count = 150
            )
            // Add more mock movies as needed
        )

        return mockMovieList
    }

}