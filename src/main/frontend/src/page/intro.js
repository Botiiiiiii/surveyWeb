// src/main/frontend/src/App.js

import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Button } from "react-bootstrap";
import styles from '../App.module.css';
import { useNavigate } from "react-router-dom";

function App() {
    const [hello, setHello] = useState('')
    const navigate = useNavigate();

    useEffect(() => {
        axios.get('/api/hello')
            .then(response => setHello(response.data))
            .catch(error => console.log(error))
    }, []);

    const goToAgreement = () => {
    navigate("/agreement");
  }

    return (
        <div >
            <div >
                <h2>안녕하세요</h2>
                <br/>
                <h2>먼저 응답에 귀한 시간 내주셔서 대단히 감사합니다.<br/> 저는 중앙대학교 융합보안학과 박사과정에 재학중인 학생이며,<br/> 본 응답은 인성검사 관련 연구를 위해 작성되었습니다.</h2>
                <br/>
                <h2>귀하의 답변은 연구목적 이외의 다른 용도로 결코 사용되지 않을 것을<br/> 약속드리니, 각 문항에 대한 솔직한 답변 부탁드립니다.</h2>
                <br/>
            </div>
            <div>
                <button className={styles.mainBody} onClick={goToAgreement}>다음</button>
            </div>
        </div>
    );
}

export default App;