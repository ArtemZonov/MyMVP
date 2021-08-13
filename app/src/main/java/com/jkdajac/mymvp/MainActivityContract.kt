package com.jkdajac.mymvp

import android.content.Intent
import androidx.fragment.app.Fragment

class MainActivityContract {

    interface MainView{
        fun setFragment(fragment: Fragment)
        fun updateTopMenu(enumItem : Int)
    }

    interface  BlueFragmentView{
        fun setPresenter(presenter : Presenter)
    }

    interface  RedFragmentView{
        fun setPresenter(presenter : Presenter)
    }

    interface  GreenFragmentView{
        fun setPresenter(presenter : Presenter)
    }

    interface  Presenter{

        fun getDbData()
        fun getServerData()
        fun showBlueFragment()
        fun showRedFragment()
        fun showGreenFragment()
    }

    
}