package jp.cordea.dsleyan

import com.xwray.groupie.databinding.BindableItem
import jp.cordea.dsleyan.databinding.ListItemMainBinding

class MainListItem(private val item: MainItem) : BindableItem<ListItemMainBinding>() {

    override fun getLayout(): Int =
            R.layout.list_item_main

    override fun bind(viewBinding: ListItemMainBinding, position: Int) {
        viewBinding.model = item
    }
}
