package com.example.familysafty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.purnasri.myfamily.HomeFragment

class mainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)

        bottomBar.setOnItemReselectedListener { menuItem ->


            if(menuItem.itemId==R.id.nav_guard){
                inflateFragment()
            }else if(menuItem.itemId==R.id.nav_home){
                inflateHomeFragment()
            }
            else if(menuItem.itemId==R.id.nav_dashboard){
                inflatedashboardFragment()
            }
            else if(menuItem.itemId==R.id.nav_profile){
                inflateprofileFragment()
            }

            true

        }


    }

    private fun inflateprofileFragment() {
        val transaction =supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,profileFragment.newInstance())
        transaction.commit()
    }

    private fun inflateGuardFragment() {
        val transaction =supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,GuardFragment.newInstance())
        transaction.commit()
    }

    private fun inflatedashboardFragment() {
        val transaction =supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,dashboardFragment.newInstance())
        transaction.commit()
    }

    private fun inflateHomeFragment() {
        val transaction =supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,HomeFragment.newInstance())
        transaction.commit()
    }

    private fun inflateFragment() {

        val transaction =supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,GuardFragment.newInstance())
        transaction.commit()
    }

}