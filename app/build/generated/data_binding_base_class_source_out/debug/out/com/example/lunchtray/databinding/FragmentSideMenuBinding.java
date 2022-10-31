// Generated by data binding compiler. Do not edit!
package com.example.lunchtray.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.lunchtray.R;
import com.example.lunchtray.model.OrderViewModel;
import com.example.lunchtray.ui.order.SideMenuFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSideMenuBinding extends ViewDataBinding {
  @NonNull
  public final Button cancelButton;

  @NonNull
  public final View divider;

  @NonNull
  public final ImageView imageView9;

  @NonNull
  public final Button nextButton;

  @NonNull
  public final TextView potatoPrice;

  @NonNull
  public final RadioButton potatoes;

  @NonNull
  public final RadioButton rice;

  @NonNull
  public final TextView ricePrice;

  @NonNull
  public final RadioButton salad;

  @NonNull
  public final TextView saladPrice;

  @NonNull
  public final RadioGroup sideOptions;

  @NonNull
  public final RadioButton soup;

  @NonNull
  public final TextView soupPrice;

  @NonNull
  public final TextView subtotal;

  @Bindable
  protected OrderViewModel mViewModel;

  @Bindable
  protected SideMenuFragment mSideFragment;

  protected FragmentSideMenuBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button cancelButton, View divider, ImageView imageView9, Button nextButton,
      TextView potatoPrice, RadioButton potatoes, RadioButton rice, TextView ricePrice,
      RadioButton salad, TextView saladPrice, RadioGroup sideOptions, RadioButton soup,
      TextView soupPrice, TextView subtotal) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cancelButton = cancelButton;
    this.divider = divider;
    this.imageView9 = imageView9;
    this.nextButton = nextButton;
    this.potatoPrice = potatoPrice;
    this.potatoes = potatoes;
    this.rice = rice;
    this.ricePrice = ricePrice;
    this.salad = salad;
    this.saladPrice = saladPrice;
    this.sideOptions = sideOptions;
    this.soup = soup;
    this.soupPrice = soupPrice;
    this.subtotal = subtotal;
  }

  public abstract void setViewModel(@Nullable OrderViewModel viewModel);

  @Nullable
  public OrderViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setSideFragment(@Nullable SideMenuFragment sideFragment);

  @Nullable
  public SideMenuFragment getSideFragment() {
    return mSideFragment;
  }

  @NonNull
  public static FragmentSideMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_side_menu, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSideMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSideMenuBinding>inflateInternal(inflater, R.layout.fragment_side_menu, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSideMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_side_menu, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSideMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSideMenuBinding>inflateInternal(inflater, R.layout.fragment_side_menu, null, false, component);
  }

  public static FragmentSideMenuBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentSideMenuBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSideMenuBinding)bind(component, view, R.layout.fragment_side_menu);
  }
}
