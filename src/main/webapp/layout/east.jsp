<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<script type="text/javascript" charset="utf-8">
	$(function() {

		$('#layout_east_calendar').calendar({
			fit : true,
			current : new Date(),
			border : false,
			onSelect : function(date) {
				$(this).calendar('moveTo', new Date());
			}
		});

		$('#layout_east_onlinePanel').panel({
			tools : [ {
				iconCls : 'database_refresh',
				handler : function() {
				}
			} ]
		});

	});
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
	<div data-options="region:'north',border:false" style="height: 180px; overflow: hidden;">
		<div id="layout_east_calendar"></div>
	</div>
	<div data-options="region:'center',border:false" style="overflow: hidden;">
		<div id="layout_east_onlinePanel" data-options="fit:true,border:false" title="一起制作的小伙伴">
			<div class="well well-small" style="margin: 3px;">
				<a href="https://me.alipay.com/sypro" target="_blank"><img alt="捐助SyPro" src="${pageContext.request.contextPath}/style/images/sshe.png" /></a>
				<hr />
				<div>
					<span class="label label-important">郭冬冬</span>
				</div>
				<br>
				<div>
					<span class="label label-important">王子文</span>
				</div>
				
				<hr />
				<strong>如果发现系统有BUG，请给我发Email:</strong>
				<a>1007916121@qq.com</a>
			</div>
		</div>
	</div>
</div>