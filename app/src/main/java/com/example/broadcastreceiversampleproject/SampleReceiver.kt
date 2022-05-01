package com.example.broadcastreceiversampleproject

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class SampleReceiver : BroadcastReceiver() {

    /**
     * 브로드캐스트 종류
     * ACTION_BOOT_COMPLETED - 부팅 완료
     *
     * ACTION_CAMERA_BUTTON - 카메라 버튼 클릭
     *
     * ACTION_DATE_CHANGED - 날짜 변경
     * ACTION_TIME_CHANGED - 시간 변경
     *
     * ACTION_SCREEN_ON - 화면 ON
     * ACTION_SCREEN_OFF - 화면 OFF
     *
     * ACTION_AIRPLANE_MODE_CHANGED - 비행기 모드 설정/해제
     *
     * ACTION_BATTERY_CHANGED - 배터리 상태 변화
     * ACTION_BATTERY_LOW - 배터리 용량 낮음
     * ACTION_BATTERY_OKAY - 배터리 낮은 용량으로 부터 벗어났을 때
     *
     * ACTION_PACKAGE_ADDED - 패키지 추가
     * ACTION_PACKAGE_CHANGED - 패키지 변경
     * ACTION_PACKAGE_DATA_CLEARED - 패키지 데이터 삭제
     * ACTION_PACKAGE_INSTALL - 패키지 설치
     * ACTION_PACKAGE_REMOVED - 패키지 삭제
     * ACTION_PACKAGE_REPLACED - 패키지 교환
     * ACTION_PACKAGE_RESTARTED - 패키지 재시작
     *
     * ACTION_POWER_CONNECTED - 충전기 연결
     * ACTION_POWER_DISCONNECTED - 충전기 연결 해제
     *
     * ACTION_REBOOT - 재부팅
     * ACTION_SHUTDOWN - 종료
     */

    override fun onReceive(context: Context, intent: Intent) {
        val msg = if (intent.action.equals(Intent.ACTION_POWER_CONNECTED)) "전원 연결" else "전원 연결 해제"
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}