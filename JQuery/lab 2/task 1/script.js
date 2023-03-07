$("#btn").on("click", function (e) {
  if ($("#txt").val()) {
    e.preventDefault();
    $("#container").append(`<div class="todo">
                                ${$("#txt").val()}
                                <button class="done">\u2713</button>
                                <button class="del">X</button>
                            <div>`);
  }
});

$("#container").on("click", ".del", {}, function () {
  $(this).parent().remove();
});
$("#container").on("click", ".done", {}, function () {
  $(this).parent().addClass("tick");
});
