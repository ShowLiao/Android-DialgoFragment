package com.example.show.simpledialogfragment;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.annotation.NonNull;

import android.support.v4.app.DialogFragment;
import android.os.Bundle;

import android.widget.EditText;

public class EditDialogFragment extends DialogFragment {

    private EditText editTask;

    public EditDialogFragment() {

    }

    public static EditDialogFragment newInstance(String title) {
        EditDialogFragment fragment = new EditDialogFragment();

        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        fragment.setArguments(bundle);
        return fragment;
    }


//    v1 : simple dlg
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
////        return super.onCreateView(inflater, container, savedInstanceState);
//        return inflater.inflate(R.layout.activity_edit_dialog_fragment, container);
//    }
//
//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        editTask = (EditText) view.findViewById(R.id.editTask);
//
//        String strTitle = getArguments().getString("title", "Enter Task");
//        getDialog().setTitle(strTitle);
//
//        editTask.requestFocus();
//        getDialog().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
//    }

//      V2 : with button
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
//        return super.onCreateDialog(savedInstanceState);
        String title = getArguments().getString("title");
        AlertDialog.Builder alertDlg = new AlertDialog.Builder(getActivity());
        alertDlg.setTitle(title);
        alertDlg.setMessage("AAAA");
        alertDlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        alertDlg.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();;
            }
        });

        return alertDlg.create();
    }
}
