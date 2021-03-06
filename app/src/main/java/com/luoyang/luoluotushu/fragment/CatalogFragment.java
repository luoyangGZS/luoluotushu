package com.luoyang.luoluotushu.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.luoyang.luoluotushu.R;
import com.luoyang.luoluotushu.adapter.CatalogueAdapter;
import com.luoyang.luoluotushu.base.BaseFragment;
import com.luoyang.luoluotushu.db.BookCatalogue;
import com.luoyang.luoluotushu.util.PageFactory;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * package: com.luoyang.luoluotushu.fragment
 * created by luoyang
 * QQ:1845313665
 * on 2018/11/1
 */
public class CatalogFragment extends BaseFragment {
    public static final String ARGUMENT = "argument";

    private PageFactory pageFactory;
    ArrayList<BookCatalogue> catalogueList = new ArrayList<>();

    @BindView(R.id.lv_catalogue)
    ListView lv_catalogue;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_catalog;
    }

    @Override
    protected void initData(View view) {
        pageFactory = PageFactory.getInstance();
        catalogueList.addAll(pageFactory.getDirectoryList());
        CatalogueAdapter catalogueAdapter = new CatalogueAdapter(getContext(), catalogueList);
        catalogueAdapter.setCharter(pageFactory.getCurrentCharter());
        lv_catalogue.setAdapter(catalogueAdapter);
        catalogueAdapter.notifyDataSetChanged();
    }

    @Override
    protected void initListener() {
        lv_catalogue.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                pageFactory.changeChapter(catalogueList.get(position).getBookCatalogueStartPos());
                getActivity().finish();
            }
        });
    }

    /**
     * 用于从Activity传递数据到Fragment
     * @param bookpath
     * @return
     */
    public static CatalogFragment newInstance(String bookpath)
    {
        Bundle bundle = new Bundle();
        bundle.putString(ARGUMENT, bookpath);
        CatalogFragment catalogFragment = new CatalogFragment();
        catalogFragment.setArguments(bundle);
        return catalogFragment;
    }

}