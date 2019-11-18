package com.example.dbinding;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.dbinding.databinding.ActivityMainBindingImpl;
import com.example.dbinding.databinding.ActivityMainKtBindingImpl;
import com.example.dbinding.databinding.FirstLayoutBindingImpl;
import com.example.dbinding.databinding.ItemRowBindingImpl;
import com.example.dbinding.databinding.SecondLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYMAINKT = 2;

  private static final int LAYOUT_FIRSTLAYOUT = 3;

  private static final int LAYOUT_ITEMROW = 4;

  private static final int LAYOUT_SECONDLAYOUT = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dbinding.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dbinding.R.layout.activity_main_kt, LAYOUT_ACTIVITYMAINKT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dbinding.R.layout.first_layout, LAYOUT_FIRSTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dbinding.R.layout.item_row, LAYOUT_ITEMROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dbinding.R.layout.second_layout, LAYOUT_SECONDLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAINKT: {
          if ("layout/activity_main_kt_0".equals(tag)) {
            return new ActivityMainKtBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main_kt is invalid. Received: " + tag);
        }
        case  LAYOUT_FIRSTLAYOUT: {
          if ("layout/first_layout_0".equals(tag)) {
            return new FirstLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for first_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMROW: {
          if ("layout/item_row_0".equals(tag)) {
            return new ItemRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_row is invalid. Received: " + tag);
        }
        case  LAYOUT_SECONDLAYOUT: {
          if ("layout/second_layout_0".equals(tag)) {
            return new SecondLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for second_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(14);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "product");
      sKeys.put(2, "mProdutName");
      sKeys.put(3, "adapter");
      sKeys.put(4, "presenter");
      sKeys.put(5, "data");
      sKeys.put(6, "price");
      sKeys.put(7, "imageURL");
      sKeys.put(8, "name");
      sKeys.put(9, "mcontent");
      sKeys.put(10, "type");
      sKeys.put(11, "mProductPrice");
      sKeys.put(12, "content");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", com.example.dbinding.R.layout.activity_main);
      sKeys.put("layout/activity_main_kt_0", com.example.dbinding.R.layout.activity_main_kt);
      sKeys.put("layout/first_layout_0", com.example.dbinding.R.layout.first_layout);
      sKeys.put("layout/item_row_0", com.example.dbinding.R.layout.item_row);
      sKeys.put("layout/second_layout_0", com.example.dbinding.R.layout.second_layout);
    }
  }
}
