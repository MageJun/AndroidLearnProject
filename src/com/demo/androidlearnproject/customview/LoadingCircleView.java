package com.demo.androidlearnproject.customview;

import android.content.Context;
import android.util.AttributeSet;

public class LoadingCircleView extends BaseView {
	
	/**
	 * ����С��Ľ�����
	 * ˮƽ�����ϣ������һ����С��С��˳ʱ������С��������ұ���һ��С�����¸�����С��
	 * @param context
	 */
	
	private double radius_0 = 0.5;
	private double radius_1 = radius_0+0.5;
	private double radius_2 = radius_1+0.5;
	private double radius_3 = radius_2+0.5;
	private double radius_4 =radius_3+0.5;
	private double radius_5 = radius_4+0.5;

	public LoadingCircleView(Context context) {
		super(context);
	}

	public LoadingCircleView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
}
