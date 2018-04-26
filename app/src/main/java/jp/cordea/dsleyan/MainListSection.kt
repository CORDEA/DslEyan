package jp.cordea.dsleyan

import com.xwray.groupie.databinding.BindableItem
import jp.cordea.dsleyan.databinding.ListItemSectionMainBinding

class MainListSection(
        private val item: MainSection
) : BindableItem<ListItemSectionMainBinding>() {

    override fun getLayout(): Int =
            R.layout.list_item_section_main

    override fun bind(viewBinding: ListItemSectionMainBinding, position: Int) {
        viewBinding.model = item
    }
}
