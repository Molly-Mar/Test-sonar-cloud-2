package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos

import com.google.gson.annotations.SerializedName

data class DetailVO(
    @SerializedName("adult") var adult: String? = "",
    @SerializedName("backdrop_path") var backdropPath: String? = "",
    @SerializedName("belongs_to_collection") var belongsToCollection: BelongToCollectionVO? = null,
    @SerializedName("budget") var budget: String? = "",
    @SerializedName("genres") var genres: ArrayList<GenresVO>? = arrayListOf(),
    @SerializedName("homepage") var homepage: String? = "",
    @SerializedName("id") var id: Int = 0,
    @SerializedName("imdb_id") var imdbId: String? = "",
    @SerializedName("original_language") var originalLanguage: String? = "",
    @SerializedName("original_title") var originalTitle: String? = "",
    @SerializedName("overview") var overview: String? = "",
    @SerializedName("popularity") var popularity: String? = "",
    @SerializedName("poster_path") var posterPath: String? = "",
    @SerializedName("production_companies") var productionCompanies: ArrayList<ProductionCompaniesVO>? = arrayListOf(),
    @SerializedName("production_countries") var productionCountries: ArrayList<ProductionCountriesVO>? = arrayListOf(),
    @SerializedName("release_date") var releaseDate: String? = "",
    @SerializedName("revenue") var revenue: String? = "",
    @SerializedName("runtime") var runtime: String? = "",
    @SerializedName("spoken_languages") var spokenLanguages: ArrayList<SpokenLanguagesVO>? = arrayListOf(),
    @SerializedName("status") var status: String? = "",
    @SerializedName("tagline") var tagline: String? = "",
    @SerializedName("title") var title: String? = "",
    @SerializedName("video") var video: String? = "",
    @SerializedName("vote_average") var voteAverage: String? = "",
    @SerializedName("vote_count") var voteCount: String? = ""
)

data class GenresVO(
    @SerializedName("id") var id: Int = 0,
    @SerializedName("name") var name: String? = ""
)

data class ProductionCompaniesVO(
    @SerializedName("id") var id: Int = 0,
    @SerializedName("logo_path") var logoPath: String? = "",
    @SerializedName("name") var name: String? = "",
    @SerializedName("origin_country") var originCountry: String? = ""
)

data class ProductionCountriesVO(
    @SerializedName("iso_3166_1") var iso31661: String? = "",
    @SerializedName("name") var name: String? = ""
)

data class SpokenLanguagesVO(
    @SerializedName("iso_639_1") var iso6391: String? = "",
    @SerializedName("name") var name: String? = ""
)

data class BelongToCollectionVO(
    @SerializedName("id") var id: Int = 0,
    @SerializedName("name") var name: String? = "",
    @SerializedName("poster_path") var posterPath: String? = "",
    @SerializedName("backdrop_path") var backdropPath: String? = ""
)