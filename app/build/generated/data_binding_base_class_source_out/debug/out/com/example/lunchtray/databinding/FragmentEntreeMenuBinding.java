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
import com.example.lunchtray.ui.order.EntreeMenuFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentEntreeMenuBinding extends ViewDataBinding {
  @NonNull
  public final RadioButton cauliflower;

  @NonNull
  public final TextView cauliflowerPrice;

  @NonNull
  public final RadioButton chicken;

  @NonNull
  public final TextView chickenPrice;

  @NonNull
  public final RadioButton chili;

  @NonNull
  public final TextView chiliPrice;

  @NonNull
  public final View divider;

  @NonNull
  public final RadioGroup entreeOptions;

  @NonNull
  public final RadioButton hamburger;

  @NonNull
  public final TextView hamburgerPrice;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final Button nextButton;

  @NonNull
  public final RadioButton pasta;

  @NonNull
  public final TextView pastaPrice;

  @NonNull
  public final RadioButton pizza;

  @NonNull
  public final TextView pizzaPrice;

  @NonNull
  public final RadioButton skillet;

  @NonNull
  public final TextView skilletPrice;

  @NonNull
  public final RadioButton steak;

  @NonNull
  public final TextView steakPrice;

  @NonNull
  public final TextView subtotal;

  @Bindable
  protected OrderViewModel mViewModel;

  @Bindable
  protected EntreeMenuFragment mEntreeFragment;

  protected FragmentEntreeMenuBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RadioButton cauliflower, TextView cauliflowerPrice, RadioButton chicken,
      TextView chickenPrice, RadioButton chili, TextView chiliPrice, View divider,
      RadioGroup entreeOptions, RadioButton hamburger, TextView hamburgerPrice, ImageView imageView,
      ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5,
      ImageView imageView6, ImageView imageView7, ImageView imageView8, Button nextButton,
      RadioButton pasta, TextView pastaPrice, RadioButton pizza, TextView pizzaPrice,
      RadioButton skillet, TextView skilletPrice, RadioButton steak, TextView steakPrice,
      TextView subtotal) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cauliflower = cauliflower;
    this.cauliflowerPrice = cauliflowerPrice;
    this.chicken = chicken;
    this.chickenPrice = chickenPrice;
    this.chili = chili;
    this.chiliPrice = chiliPrice;
    this.divider = divider;
    this.entreeOptions = entreeOptions;
    this.hamburger = hamburger;
    this.hamburgerPrice = hamburgerPrice;
    this.imageView = imageView;
    this.imageView2 = imageView2;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.imageView5 = imageView5;
    this.imageView6 = imageView6;
    this.imageView7 = imageView7;
    this.imageView8 = imageView8;
    this.nextButton = nextButton;
    this.pasta = pasta;
    this.pastaPrice = pastaPrice;
    this.pizza = pizza;
    this.pizzaPrice = pizzaPrice;
    this.skillet = skillet;
    this.skilletPrice = skilletPrice;
    this.steak = steak;
    this.steakPrice = steakPrice;
    this.subtotal = subtotal;
  }

  public abstract void setViewModel(@Nullable OrderViewModel viewModel);

  @Nullable
  public OrderViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setEntreeFragment(@Nullable EntreeMenuFragment entreeFragment);

  @Nullable
  public EntreeMenuFragment getEntreeFragment() {
    return mEntreeFragment;
  }

  @NonNull
  public static FragmentEntreeMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_entree_menu, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEntreeMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentEntreeMenuBinding>inflateInternal(inflater, R.layout.fragment_entree_menu, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentEntreeMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_entree_menu, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEntreeMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentEntreeMenuBinding>inflateInternal(inflater, R.layout.fragment_entree_menu, null, false, component);
  }

  public static FragmentEntreeMenuBinding bind(@NonNull View view) {
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
  public static FragmentEntreeMenuBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentEntreeMenuBinding)bind(component, view, R.layout.fragment_entree_menu);
  }
}
