{{ if isset .Site.Params "authors" }}
	<style>
		.author {
			background-color: white
			padding: 0.5em 0.5em 0.5em 0.5em; 
		}
		.author_img {
			float:left; 
			padding: 0.5em 0.5em 0.5em 0.5em; 
		}
		.author_text {
		}
	</style>

	<div class="author doc" >

		<div class="author_img">
			{{ .Page.Params.avatar}}
		</div> 

		<div class="author_text" >
			{{ .Page.Params.author}}
		</div>

	</div>
	</a>
{{ end }}
