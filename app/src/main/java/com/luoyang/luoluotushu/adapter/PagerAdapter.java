package com.luoyang.luoluotushu.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.luoyang.luoluotushu.fragment.BookMarkFragment;
import com.luoyang.luoluotushu.fragment.CatalogFragment;

/**
 * package: com.luoyang.luoluotushu.adapter
 * created by luoyang
 * QQ:1845313665
 * on 2018/11/1
 */


public class PagerAdapter extends FragmentPagerAdapter {
    private CatalogFragment catalogueFragment;
    private BookMarkFragment bookMarkFragment;
    private String bookPath;
    private final String[] titles = { "目录", "书签" };

    public PagerAdapter(FragmentManager fm, String bookPath) {
        super(fm);
        this.bookPath = bookPath;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                if (catalogueFragment == null) {
                    //  bookMarkFragment = new BookMarkFragment();
                    //创建bookMarkFragment实例时同时把需要intent中的值传入
//                    catalogueFragment = CatalogFragment
                    // bookMarkFragment = BookMarkFragment.newInstance(MarkActivity.getBookpath_intent());
                    catalogueFragment = CatalogFragment.newInstance(bookPath);
                }
                return catalogueFragment;

            case 1:
                if (bookMarkFragment == null) {
                    //catalogueFragment = new CatalogueFragment();
                    //  catalogueFragment = CatalogueFragment.newInstance(MarkActivity.getBookpath_intent());
//                    bookMarkFragment = BookMarkFragment.newInstance(MarkActivity.getBookpath_intent());
                    bookMarkFragment = BookMarkFragment.newInstance(bookPath);
                }
                return bookMarkFragment;
        }

        return null;
    }

}
