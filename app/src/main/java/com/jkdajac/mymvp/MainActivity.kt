package com.jkdajac.mymvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_blue.*

class MainActivity : AppCompatActivity(), MainActivityContract.MainView {

    val presenter = MainActivityPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            presenter.showBlueFragment()
        }

        button2.setOnClickListener {
            presenter.showRedFragment()
        }

        button3.setOnClickListener {
            presenter.showGreenFragment()
        }
    }

    override fun setFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flfragment, fragment)
            .commit()
    }

    override fun updateTopMenu(enumItem: Int) {
        TODO("Not yet implemented")
    }

}