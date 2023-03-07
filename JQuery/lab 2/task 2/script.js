$("#container").hover(function () {
  $("#bugs").effect("shake");
});
$("img").draggable({ revert: true });
$(function () {
  $("#bugs").draggable();
  $("#bh").droppable({
    drop: function (event, ui) {
      $("#bugs").css("display", "none");
    },
  });
});
