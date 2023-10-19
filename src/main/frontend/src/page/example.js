import React, { useEffect, useState } from 'react';
import axios from 'axios';
import styles from '../App.module.css';
import '../App.css';
import Next from "../component/nextButton.js"
import Choice from "../component/choice.js"
import { useNavigate } from "react-router-dom";

function App() {
    const navigate = useNavigate();

    const goToAgreement = () => {
        navigate("/agreement");
    }

    return (
    <div >
        <h1 id="example-text">예시문제</h1>
        <Choice></Choice>
        <Next onClick = {goToAgreement}/>
    </div>
    );
}

export default App;