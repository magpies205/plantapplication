package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEntreeMenuBindingImpl extends FragmentEntreeMenuBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.entree_options, 15);
        sViewsWithIds.put(R.id.imageView, 16);
        sViewsWithIds.put(R.id.imageView2, 17);
        sViewsWithIds.put(R.id.imageView3, 18);
        sViewsWithIds.put(R.id.imageView4, 19);
        sViewsWithIds.put(R.id.imageView5, 20);
        sViewsWithIds.put(R.id.imageView6, 21);
        sViewsWithIds.put(R.id.divider, 22);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEntreeMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private FragmentEntreeMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.RadioButton) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.view.View) bindings[22]
            , (android.widget.RadioGroup) bindings[15]
            , (android.widget.RadioButton) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.Button) bindings[14]
            , (android.widget.RadioButton) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[13]
            );
        this.cauliflower.setTag(null);
        this.cauliflowerPrice.setTag(null);
        this.chicken.setTag(null);
        this.chickenPrice.setTag(null);
        this.chili.setTag(null);
        this.chiliPrice.setTag(null);
        this.hamburger.setTag(null);
        this.hamburgerPrice.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.pasta.setTag(null);
        this.pastaPrice.setTag(null);
        this.skillet.setTag(null);
        this.skilletPrice.setTag(null);
        this.subtotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.example.lunchtray.generated.callback.OnClickListener(this, 7);
        mCallback11 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback12 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback9 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback13 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
        mCallback14 = new com.example.lunchtray.generated.callback.OnClickListener(this, 6);
        mCallback10 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.entreeFragment == variableId) {
            setEntreeFragment((com.example.lunchtray.ui.order.EntreeMenuFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEntreeFragment(@Nullable com.example.lunchtray.ui.order.EntreeMenuFragment EntreeFragment) {
        this.mEntreeFragment = EntreeFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.entreeFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSubtotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSubtotal(androidx.lifecycle.LiveData<java.lang.String> ViewModelSubtotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelMenuItemsHamburgerName = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelSubtotal = null;
        java.lang.String viewModelMenuItemsSkilletGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsChickenName = null;
        java.lang.String viewModelMenuItemsPastaName = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsPasta = null;
        java.lang.String viewModelMenuItemsSkilletName = null;
        java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;
        com.example.lunchtray.ui.order.EntreeMenuFragment entreeFragment = mEntreeFragment;
        java.lang.String viewModelMenuItemsCauliflowerGetFormattedPrice = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsCauliflower = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsHamburger = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsSkillet = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsChicken = null;
        java.lang.String viewModelMenuItemsChiliGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsCauliflowerName = null;
        java.lang.String viewModelMenuItemsPastaGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsHamburgerGetFormattedPrice = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelSubtotal = null;
        java.lang.String viewModelMenuItemsChickenGetFormattedPrice = null;
        java.lang.String viewModelSubtotalGetValue = null;
        java.lang.String viewModelMenuItemsChiliName = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsChili = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.subtotal
                    viewModelSubtotal = viewModel.getSubtotal();
                }
                updateLiveDataRegistration(0, viewModelSubtotal);


                if (viewModelSubtotal != null) {
                    // read viewModel.subtotal.getValue()
                    viewModelSubtotalGetValue = viewModelSubtotal.getValue();
                }


                // read @android:string/subtotal
                subtotalAndroidStringSubtotalViewModelSubtotal = subtotal.getResources().getString(R.string.subtotal, viewModelSubtotalGetValue);
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.menuItems
                        viewModelMenuItems = viewModel.getMenuItems();
                    }


                    if (viewModelMenuItems != null) {
                        // read viewModel.menuItems["pasta"]
                        viewModelMenuItemsPasta = viewModelMenuItems.get("pasta");
                        // read viewModel.menuItems["cauliflower"]
                        viewModelMenuItemsCauliflower = viewModelMenuItems.get("cauliflower");
                        // read viewModel.menuItems["hamburger"]
                        viewModelMenuItemsHamburger = viewModelMenuItems.get("hamburger");
                        // read viewModel.menuItems["skillet"]
                        viewModelMenuItemsSkillet = viewModelMenuItems.get("skillet");
                        // read viewModel.menuItems["chicken"]
                        viewModelMenuItemsChicken = viewModelMenuItems.get("chicken");
                        // read viewModel.menuItems["chili"]
                        viewModelMenuItemsChili = viewModelMenuItems.get("chili");
                    }


                    if (viewModelMenuItemsPasta != null) {
                        // read viewModel.menuItems["pasta"].name
                        viewModelMenuItemsPastaName = viewModelMenuItemsPasta.getName();
                        // read viewModel.menuItems["pasta"].getFormattedPrice()
                        viewModelMenuItemsPastaGetFormattedPrice = viewModelMenuItemsPasta.getFormattedPrice();
                    }
                    if (viewModelMenuItemsCauliflower != null) {
                        // read viewModel.menuItems["cauliflower"].getFormattedPrice()
                        viewModelMenuItemsCauliflowerGetFormattedPrice = viewModelMenuItemsCauliflower.getFormattedPrice();
                        // read viewModel.menuItems["cauliflower"].name
                        viewModelMenuItemsCauliflowerName = viewModelMenuItemsCauliflower.getName();
                    }
                    if (viewModelMenuItemsHamburger != null) {
                        // read viewModel.menuItems["hamburger"].name
                        viewModelMenuItemsHamburgerName = viewModelMenuItemsHamburger.getName();
                        // read viewModel.menuItems["hamburger"].getFormattedPrice()
                        viewModelMenuItemsHamburgerGetFormattedPrice = viewModelMenuItemsHamburger.getFormattedPrice();
                    }
                    if (viewModelMenuItemsSkillet != null) {
                        // read viewModel.menuItems["skillet"].getFormattedPrice()
                        viewModelMenuItemsSkilletGetFormattedPrice = viewModelMenuItemsSkillet.getFormattedPrice();
                        // read viewModel.menuItems["skillet"].name
                        viewModelMenuItemsSkilletName = viewModelMenuItemsSkillet.getName();
                    }
                    if (viewModelMenuItemsChicken != null) {
                        // read viewModel.menuItems["chicken"].name
                        viewModelMenuItemsChickenName = viewModelMenuItemsChicken.getName();
                        // read viewModel.menuItems["chicken"].getFormattedPrice()
                        viewModelMenuItemsChickenGetFormattedPrice = viewModelMenuItemsChicken.getFormattedPrice();
                    }
                    if (viewModelMenuItemsChili != null) {
                        // read viewModel.menuItems["chili"].getFormattedPrice()
                        viewModelMenuItemsChiliGetFormattedPrice = viewModelMenuItemsChili.getFormattedPrice();
                        // read viewModel.menuItems["chili"].name
                        viewModelMenuItemsChiliName = viewModelMenuItemsChili.getName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cauliflower, viewModelMenuItemsCauliflowerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cauliflowerPrice, viewModelMenuItemsCauliflowerGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chicken, viewModelMenuItemsChickenName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chickenPrice, viewModelMenuItemsChickenGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chili, viewModelMenuItemsChiliName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chiliPrice, viewModelMenuItemsChiliGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.hamburger, viewModelMenuItemsHamburgerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.hamburgerPrice, viewModelMenuItemsHamburgerGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pasta, viewModelMenuItemsPastaName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pastaPrice, viewModelMenuItemsPastaGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skillet, viewModelMenuItemsSkilletName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skilletPrice, viewModelMenuItemsSkilletGetFormattedPrice);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.cauliflower.setOnClickListener(mCallback9);
            this.chicken.setOnClickListener(mCallback13);
            this.chili.setOnClickListener(mCallback10);
            this.hamburger.setOnClickListener(mCallback14);
            this.nextButton.setOnClickListener(mCallback15);
            this.pasta.setOnClickListener(mCallback11);
            this.skillet.setOnClickListener(mCallback12);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalViewModelSubtotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 7: {
                // localize variables for thread safety
                // entreeFragment != null
                boolean entreeFragmentJavaLangObjectNull = false;
                // entreeFragment
                com.example.lunchtray.ui.order.EntreeMenuFragment entreeFragment = mEntreeFragment;



                entreeFragmentJavaLangObjectNull = (entreeFragment) != (null);
                if (entreeFragmentJavaLangObjectNull) {


                    entreeFragment.goToNextScreen();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree("pasta");
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree("skillet");
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree("cauliflower");
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree("chicken");
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree("hamburger");
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree("chili");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.subtotal
        flag 1 (0x2L): entreeFragment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}