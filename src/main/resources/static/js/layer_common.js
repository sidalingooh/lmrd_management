var layerIndex = undefined;

function isBlank(s) {

	// str trim
	var _trim = function(s) {
		return s.replace(/(^\s*)|(\s*$)/g, '');
	};
	if (s == undefined || s == null || _trim(s) == '') {
		return true;
	}
	return false;
}

function msg(msg) {
	layer.msg(msg, {
		shift : 6,
		time : 1000
	});
}

// auto alert div size
function autoSize($div) {
	var docH = $(document).height();
	var divW = $div.width();
	var divH = $div.height();

	// 宽度不变，居中
	var margin_left = divW / 2;
	
	// 垂直，居中
	var margin_top = divH / 2;

	// 若超高
	if (divH >= docH) {
		var children = $div.children();
		$(children[1]).attr('cssCopy', $(children[1]).attr('style'));
		divH = (children.length == 2) ? (docH - 43) : (docH - 43 - 98);
		$(children[1]).css('max-height', divH + 'px').css('overflow-y', 'auto');
		margin_top = docH / 2;
		$(children[1]).attr('cssCopy', $(children[1]).attr('style'));
	}

	$div.css('margin', '-' + margin_top + 'px 0 0 -' + margin_left + 'px');
}

function openLayer($div) {
	autoSize($div);
	layerIndex = layer.open({
		type : 1,
		title : false,
		shadeClose : false,
		shade : 0.5,
		closeBtn : false,
		content : $div
	});
}

function closeLayer() {
	if (layerIndex) {
		layer.close(layerIndex);
		layerIndex = undefined;
	}
}

function loadShadow() {
	return layer.load(1, {
		shade : [ 0.1, '#fff' ]
	});
}

function pageReload(msg) {
	layer.msg(msg, {
		time : 1000
	}, function() {
		loadShadow();
		window.location.reload(true);
	});
}

// ajax request
function ajaxRequest(request) {
	var loadIndex = loadShadow();
	$.ajax({
		type : request.method || 'post',
		url : rootPath + request.url,
		dataType : request.dataType || 'json',
		data : request.requestData,
		async : request.async || false,
		cache : false,
		success : function(data) {
			layer.close(loadIndex);
			if (data.result == 0) {
				request.successCallback.apply(undefined, [ data ]);
			} else if (data.result == -1) {
				msg(data.message);
			} else {
				msg(request.failureStr || '请求失败');
			}
		},
		error : function() {
			layer.close(loadIndex);
			msg('Ajax请求失败');
		}
	});
}

function uploadFile(e) {
	$
			.ajaxFileUpload({
				url : rootPath + '/goods/import/goodsImage.action', // 用于文件上传的服务器端请求地址
				secureuri : false, // 是否需要安全协议，一般设置为false
				fileElementId : $(e).attr('id'), // 文件上传域的ID
				dataType : 'json', // 返回值类型 一般设置为json
				success : function(data, status) {
					var src = rootPath
							+ '/goods/down/goodsImage.action?fileName='
							+ data.data;
					$('#' + $(e).attr('appendId'))
							.append(
									'<img src="'
											+ src
											+ '" class="'+$(e).attr('imageClassProfix')+'uploadImage" fileName="'
											+ data.data
											+ '" width="88" height="88" style="margin-left:10px;margin-top:10px;" title="点击移除" onclick="$(this).remove();"/>');
				},
				error : function(data, status, e) {
					alert(e);
				}
			});
}
