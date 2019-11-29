import React from 'react';
import PropTypes from 'prop-types';

const Button=function(props){
    let className=props.className||"";
    className+=" button "+props.name;
    if (props.toggle !== undefined){
        className+=props.toggle?" active":" inactive";
    }
    let {toggle,icon,style,disabled,...forward}=props;
    if (! style) style={};
    if (icon !== undefined) {
        style.backgroundImage="url("+icon+")";
    }
    let add={};
    if (disabled){
        add.disabled="disabled";
    }
    return(
        <button {...forward} {...add} className={className} style={style}/>
    );
};

Button.propTypes={
    onClick: PropTypes.func,
    className: PropTypes.string,
    toggle: PropTypes.bool,
    name: PropTypes.string.isRequired,
    icon: PropTypes.string,
    style: PropTypes.object,
    disabled: PropTypes.bool
};

module.exports=Button;