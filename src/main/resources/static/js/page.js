function focus_gopage(){
    var btnGo = $("#btn_go");
    $('#btn_go_input').attr('hideFocus',true);
    btnGo.show();
    btnGo.css('left','10px');
    $('#btn_go_input').addClass('focus');
    btnGo.animate({left: '+=30'}, 50);
}

function blur_gopage(){
    var _this = this;
    setTimeout(function(){
        var btnGo = $("#btn_go");
        btnGo.animate({
            left: '-=25'
        }, 100, function(){
            btnGo.hide();
            $('#btn_go_input').removeClass('focus');
        });
    },400);
}

function keypress_gopage(){
    var event = arguments[0] || window.event;
    var code = event.keyCode || event.charCode;
    //delete key
    if(code == 8) return true;
    //enter key
    if(code == 13){
        gopage();
        return false;
    }
    //copy and paste
    if(event.ctrlKey && (code == 99 || code == 118)) return true;
    //only number key
    if(code<48 || code>57)return false;
    return true;
}

function gopage(){
    var str_page = $('#btn_go_input').val();
    if(isNaN(str_page)){
        $('#btn_go_input').val(this.next);
        return;
    }
    var n = parseInt(str_page);
    if(n < 1) n = 1;
    if(n > this.total) n = this.total;
    if(this.mode == 'click'){
        this._clickHandler(n);
    }else{
        turnOverPagetop(str_page)
    }
}