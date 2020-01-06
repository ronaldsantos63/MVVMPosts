package com.ronaldsantos.mvvmposts.base

import androidx.lifecycle.ViewModel
import com.ronaldsantos.mvvmposts.injection.component.DaggerViewModelInjector
import com.ronaldsantos.mvvmposts.injection.component.ViewModelInjector
import com.ronaldsantos.mvvmposts.injection.module.NetworkModule
import com.ronaldsantos.mvvmposts.ui.post.PostListViewModel

abstract class BaseViewModel : ViewModel() {
    private val injector: ViewModelInjector = DaggerViewModelInjector
                .builder()
                .networkModule(NetworkModule)
                .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}