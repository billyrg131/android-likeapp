package com.example.likeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.likeapp.fragments.ChatsFragment
import com.example.likeapp.fragments.FavoritesFragment
import com.example.likeapp.fragments.HomeFragment
import com.example.likeapp.fragments.SettingsFragment
import com.example.likeapp.fragments.adapters.VPAdapter
import kotlinx.android.synthetic.main.activity_tab.*

class TabActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)

        setUpTabs()
    }

    private fun setUpTabs(){
        val adapter = VPAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(FavoritesFragment(), "Favorites")
        adapter.addFragment(SettingsFragment(), "Settings")
        adapter.addFragment(ChatsFragment(), "Chats")

        viewPager.adapter = adapter
        tab.setupWithViewPager(viewPager)

        tab.getTabAt(0)!!.setIcon(R.drawable.ic_home)
        tab.getTabAt(1)!!.setIcon(R.drawable.ic_favorite)
        tab.getTabAt(2)!!.setIcon(R.drawable.ic_lock)
        tab.getTabAt(3)!!.setIcon(R.drawable.ic_message)
    }
}