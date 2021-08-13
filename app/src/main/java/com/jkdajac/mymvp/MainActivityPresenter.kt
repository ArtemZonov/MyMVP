package com.jkdajac.mymvp


class MainActivityPresenter(val mainView: MainActivityContract.MainView) : MainActivityContract.Presenter {
    override fun getDbData() {
        TODO("Not yet implemented")
    }

    override fun getServerData() {
        TODO("Not yet implemented")
    }

    override fun showBlueFragment() {
        val fragment = BlueFragment.newInstance("", "")
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }

    override fun showRedFragment() {
        val fragment = RedFragment.newInstance("", "")
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }

    override fun showGreenFragment() {
        val fragment = GreenFragment.newInstance("", "")
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }


}