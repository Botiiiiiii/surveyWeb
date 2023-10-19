import React, { useEffect, useState } from 'react';
import axios from 'axios';
import styles from '../App.module.css';
import '../App.css';

function Choice() {
    return (
    <div>
    <ul>
    <li>전혀 그렇지 않다</li>
    <li>그렇지않다</li>
    <li>보통이다</li>
    <li>그렇다</li>
    <li>매우 그렇다</li>
    </ul>
    </div>
    );
}

export default Choice;