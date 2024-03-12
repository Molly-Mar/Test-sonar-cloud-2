package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.impls

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.LiveData
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.BaseModel
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.PopularMovieModel
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.*
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.utils.PARAM_API_VALUE
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object PopularMovieModelImpl : PopularMovieModel,
    BaseModel() {

    override fun getAllPopularMovie(): LiveData<List<PopularMovieVO>> {
        return mPopularDB.popularMovieDao().getAllPopularMovie()
    }

    @SuppressLint("CheckResult")
    override fun getAllMovieFromApiAndSaveDatabase() {
        mPopularMovieApi.getAllPopularMovie(PARAM_API_VALUE)
            .map { it.results }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                mPopularDB.popularMovieDao().insertPopularMovieList(it ?: arrayListOf())
            }
    }

    @SuppressLint("CheckResult")
    override fun getDiscover(
        onSuccess: (List<DiscoverVO>) -> Unit,
        genreID: Int
    ): LiveData<List<DiscoverVO>> {
        mPopularMovieApi.getDiscover(PARAM_API_VALUE, genreID)
            .map { it.results }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                onSuccess(it)
                mPopularDB.popularMovieDao().setDiscover(it ?: listOf())
            }
        return mPopularDB.popularMovieDao().getAllDiscover(withGenre = genreID)
    }

    override fun getMovieById(movieId: Int): LiveData<PopularMovieVO> {
        return mPopularDB.popularMovieDao().getPopularMovieById(movieId)
    }

    @SuppressLint("CheckResult")
    override fun getDetail(id: Int, onSuccess: (DetailVO) -> Unit) {
        mPopularMovieApi.getDetail(id, PARAM_API_VALUE)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onSuccess(it!!)
            }, {
                Log.e("Tag", it.toString())
            })
    }

    @SuppressLint("CheckResult")
    override fun getVideo(id: Int, onSuccess: (List<VideoVO>) -> Unit) {
        mPopularMovieApi.getVideo(id, PARAM_API_VALUE)
            .map {
                it.results
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onSuccess(it)
            }, {
                Log.e("error", it.toString())
            })
    }

    @SuppressLint("CheckResult")
    override fun getBestActor(): LiveData<List<BestActorVO>> {
        mPopularMovieApi.getAllBestActor(PARAM_API_VALUE)
            .map { it.results }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                mPopularDB.popularMovieDao().setBestActor(it ?: listOf())
            }
        return mPopularDB.popularMovieDao().getAllBestActor()
    }

    @SuppressLint("CheckResult")
    override fun getGenreMovie(): List<GenreMovieVO> {
        mPopularMovieApi.getGenreMovie(PARAM_API_VALUE)
            .map { it.genres }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                mPopularDB.popularMovieDao().setGenreMovieList(it ?: listOf())
            }) {
                Log.e("Error", it.localizedMessage)
            }
        return mPopularDB.popularMovieDao().getGenreMovieList()
    }

    @SuppressLint("CheckResult")
    override fun getShowcaseMovie(): LiveData<List<ShowcaseVO>> {
        mPopularMovieApi.getAllShowcase(PARAM_API_VALUE)
            .map { it.results }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                mPopularDB.popularMovieDao().setShowcase(it?.toList() ?: listOf())
            }, {
                Log.e("Tag", it.toString())
            })
        return mPopularDB.popularMovieDao().getAllShowcase()
    }

    @SuppressLint("CheckResult")
    override fun getTopRatedMovieList(): LiveData<List<TopRateVO>> {
        mPopularMovieApi.getTopRated(PARAM_API_VALUE)
            .map { it.results }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                mPopularDB.popularMovieDao().setTopRatedList(it?.toList() ?: listOf())
            }
        return mPopularDB.popularMovieDao().getTopRatedList()
    }

    @SuppressLint("CheckResult")
    override fun getCast(movieId: Int,onSuccess: (List<CastVO>) -> Unit) {
        mPopularMovieApi.getCredit(movieId, PARAM_API_VALUE)
            .map {
                it.cast
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                onSuccess(it ?: listOf())
            }
    }

    @SuppressLint("CheckResult")
    override fun getCrew(movieId: Int, onSuccess: (List<CrewVO>) -> Unit) {
        mPopularMovieApi.getCredit(movieId, PARAM_API_VALUE)
            .map {
                it.crew
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe ({
                onSuccess(it ?: listOf())
            },{
                Log.e("Error",it.toString())
            })
    }

}