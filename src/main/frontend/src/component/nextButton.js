import React, { useEffect, useState } from 'react';
import axios from 'axios';
import styles from '../App.module.css';
import '../App.css';
import arrow from "../asset/arrow.png"

function NextButton(props) {
    console.log(props)
    return (
    <div id="button-frame" className="button-frame" onClick={props.onClick} >
    <div id="button" className="button">
    <h1 id="button_text" className="button_text">다음</h1>
    <img src={arrow} alt=""/>
    </div>
    </div>
    );
}

export default NextButton;