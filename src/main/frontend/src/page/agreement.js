import React, { useEffect, useState } from 'react';
import axios from 'axios';
import styles from '../App.module.css';
import '../App.css';

function App() {

    return (
    <div>
        <h2>연구 참여 방법</h2>
        <br/>
        <h2>만일 귀하가 참여의사를 밝혀 주시면 다음과 같은 가능이 진행될 것입니다.<br/>인적사항 기재 후 예비 문항을 푸신 후 실제 연구에 사용될 총 000문항을 00분의 시간제한 안에서 풀게 됩니다.<br/>답변의 경우 Likert 5점 척도를 활용하여 전혀 그렇지 않다, 그렇지 않다, 보통이다, 그렇다. 매우 그렇다로 선택하실 수 있습니다.<br/>스마트폰보다는 컴퓨터 사용을 권장드리며 총 소요시간은 20분 정도로 예상됩니다.
        </h2>
        <br/>
        <div className={styles.center}>
            <h2>귀하께서는 연구 방법을 숙지하였으며 연구에 참여할 것을 동의하시겠습니까?  </h2>
            <h5>동의함에 체크하시면 연구의 방법이 귀하에게 설명되었음을 뜻하며 또한 귀하가 연구에 참여할 것에 동의하셨음을 의미합니다.</h5>
        </div>
    </div>
    );
}

export default App;