package com.example.lab3ui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.lab3ui.databinding.ActivityMainBindingImpl;
import com.example.lab3ui.databinding.AddNewQuestionAnswerItemBindingImpl;
import com.example.lab3ui.databinding.AppBarMainBindingImpl;
import com.example.lab3ui.databinding.FragmentAccountBindingImpl;
import com.example.lab3ui.databinding.FragmentCreateQuestionBindingImpl;
import com.example.lab3ui.databinding.FragmentLoginBindingImpl;
import com.example.lab3ui.databinding.FragmentPollingBindingImpl;
import com.example.lab3ui.databinding.FragmentQuestionsBindingImpl;
import com.example.lab3ui.databinding.FragmentRegisterBindingImpl;
import com.example.lab3ui.databinding.PollingAnswerItemBindingImpl;
import com.example.lab3ui.databinding.QuestionItemBindingImpl;
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

  private static final int LAYOUT_ADDNEWQUESTIONANSWERITEM = 2;

  private static final int LAYOUT_APPBARMAIN = 3;

  private static final int LAYOUT_FRAGMENTACCOUNT = 4;

  private static final int LAYOUT_FRAGMENTCREATEQUESTION = 5;

  private static final int LAYOUT_FRAGMENTLOGIN = 6;

  private static final int LAYOUT_FRAGMENTPOLLING = 7;

  private static final int LAYOUT_FRAGMENTQUESTIONS = 8;

  private static final int LAYOUT_FRAGMENTREGISTER = 9;

  private static final int LAYOUT_POLLINGANSWERITEM = 10;

  private static final int LAYOUT_QUESTIONITEM = 11;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(11);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lab3ui.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lab3ui.R.layout.add_new_question_answer_item, LAYOUT_ADDNEWQUESTIONANSWERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lab3ui.R.layout.app_bar_main, LAYOUT_APPBARMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lab3ui.R.layout.fragment_account, LAYOUT_FRAGMENTACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lab3ui.R.layout.fragment_create_question, LAYOUT_FRAGMENTCREATEQUESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lab3ui.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lab3ui.R.layout.fragment_polling, LAYOUT_FRAGMENTPOLLING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lab3ui.R.layout.fragment_questions, LAYOUT_FRAGMENTQUESTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lab3ui.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lab3ui.R.layout.polling_answer_item, LAYOUT_POLLINGANSWERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.lab3ui.R.layout.question_item, LAYOUT_QUESTIONITEM);
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
        case  LAYOUT_ADDNEWQUESTIONANSWERITEM: {
          if ("layout/add_new_question_answer_item_0".equals(tag)) {
            return new AddNewQuestionAnswerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for add_new_question_answer_item is invalid. Received: " + tag);
        }
        case  LAYOUT_APPBARMAIN: {
          if ("layout/app_bar_main_0".equals(tag)) {
            return new AppBarMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for app_bar_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTACCOUNT: {
          if ("layout/fragment_account_0".equals(tag)) {
            return new FragmentAccountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_account is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCREATEQUESTION: {
          if ("layout/fragment_create_question_0".equals(tag)) {
            return new FragmentCreateQuestionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_create_question is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPOLLING: {
          if ("layout/fragment_polling_0".equals(tag)) {
            return new FragmentPollingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_polling is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTQUESTIONS: {
          if ("layout/fragment_questions_0".equals(tag)) {
            return new FragmentQuestionsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_questions is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTER: {
          if ("layout/fragment_register_0".equals(tag)) {
            return new FragmentRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
        }
        case  LAYOUT_POLLINGANSWERITEM: {
          if ("layout/polling_answer_item_0".equals(tag)) {
            return new PollingAnswerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for polling_answer_item is invalid. Received: " + tag);
        }
        case  LAYOUT_QUESTIONITEM: {
          if ("layout/question_item_0".equals(tag)) {
            return new QuestionItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for question_item is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(10);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "answer");
      sKeys.put(2, "fragment");
      sKeys.put(3, "loginFragment");
      sKeys.put(4, "position");
      sKeys.put(5, "question");
      sKeys.put(6, "questionFragment");
      sKeys.put(7, "registerFragment");
      sKeys.put(8, "repository");
      sKeys.put(9, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(11);

    static {
      sKeys.put("layout/activity_main_0", com.example.lab3ui.R.layout.activity_main);
      sKeys.put("layout/add_new_question_answer_item_0", com.example.lab3ui.R.layout.add_new_question_answer_item);
      sKeys.put("layout/app_bar_main_0", com.example.lab3ui.R.layout.app_bar_main);
      sKeys.put("layout/fragment_account_0", com.example.lab3ui.R.layout.fragment_account);
      sKeys.put("layout/fragment_create_question_0", com.example.lab3ui.R.layout.fragment_create_question);
      sKeys.put("layout/fragment_login_0", com.example.lab3ui.R.layout.fragment_login);
      sKeys.put("layout/fragment_polling_0", com.example.lab3ui.R.layout.fragment_polling);
      sKeys.put("layout/fragment_questions_0", com.example.lab3ui.R.layout.fragment_questions);
      sKeys.put("layout/fragment_register_0", com.example.lab3ui.R.layout.fragment_register);
      sKeys.put("layout/polling_answer_item_0", com.example.lab3ui.R.layout.polling_answer_item);
      sKeys.put("layout/question_item_0", com.example.lab3ui.R.layout.question_item);
    }
  }
}
