package jp.cordea.dsleyan

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import jp.cordea.dsleyan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil
                .setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val items = list {
            section {
                title = "section 1"
                item {
                    title = "1"
                }
                item {
                    title = "2"
                }
            }
            section {
                title = "section 2"
                item {
                    title = "3"
                }
            }
        }

        binding.recycler.adapter = MainListAdapter(items)
    }
}
