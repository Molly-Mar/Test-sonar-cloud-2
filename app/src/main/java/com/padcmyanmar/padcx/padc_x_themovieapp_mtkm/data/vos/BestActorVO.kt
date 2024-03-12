package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.google.gson.annotations.SerializedName
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.persistence.typeconverters.KnownForTypeConverter

@Entity(tableName = "best_actor_entity")
@TypeConverters(KnownForTypeConverter::class)
data class BestActorVO(
    @SerializedName("popularity") var popularity: String? = "",
    @SerializedName("known_for_department") var knownForDepartment: String? = "",
    @SerializedName("gender") var gender: String? = "",
    @PrimaryKey
    @SerializedName("id") var id: Int = 0,
    @SerializedName("profile_path") var profilePath: String? = "",
    @SerializedName("adult") var adult: String? = "",
    @SerializedName("known_for") var knownFor: ArrayList<KnownForVO>? = arrayListOf(),
    @SerializedName("name") var name: String? = ""
)

data class KnownForVO(
    @SerializedName("release_date") var releaseDate: String? = "",
    @SerializedName("id") var id: Int = 0,
    @SerializedName("vote_count") var voteCount: String? = "",
    @SerializedName("video") var video: String? = "",
    @SerializedName("media_type") var mediaType: String? = "",
    @SerializedName("vote_average") var voteAverage: String? = "",
    @SerializedName("title") var title: String? = "",
    @SerializedName("genre_ids") var genreIds: ArrayList<Int>? = arrayListOf(),
    @SerializedName("original_title") var originalTitle: String? = "",
    @SerializedName("original_language") var originalLanguage: String? = "",
    @SerializedName("adult") var adult: String? = "",
    @SerializedName("backdrop_path") var backdropPath: String? = "",
    @SerializedName("overview") var overview: String? = "",
    @SerializedName("poster_path") var posterPath: String? = ""
)
