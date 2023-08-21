package com.example.moviedatabase

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviedatabase.Constants.MOVIE_PATH
import com.example.moviedatabase.databinding.MovieItemBinding
import com.example.moviedatabase.api.domain.ApiMovie


class MovieAdapter() :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() { // specify holder here

    private var moviesData: List<ApiMovie> = ArrayList() // Movie objects


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MovieViewHolder {
        // Create a new view, which defines the UI of the list item
//        val view = LayoutInflater.from(viewGroup.context)
//            .inflate(R.layout.text_row_item, viewGroup, false)

        val binding =
            MovieItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)

        return MovieViewHolder(binding)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: MovieViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
//        viewHolder.textView.text = dataSet[position]

        val currentItem = moviesData[position]

        currentItem.let {
            viewHolder.bind(it)
        }

    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = moviesData.size

    fun updateData(moviesData: List<ApiMovie>) {
        this.moviesData = moviesData
        notifyDataSetChanged()
    }


    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var binding: MovieItemBinding

        constructor(binding: MovieItemBinding) : this(binding.root) {
            this.binding = binding
        }

        /*
        Object to view
         */
        fun bind(movie: ApiMovie) {
            Glide
                .with(binding.root.context)
                .load(
                    MOVIE_PATH.plus(movie.poster_path)
                )
                .centerCrop()
                .into(binding.imgPoster);

            binding.txtMovieName.text = movie.title
        }
    }

}
